var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){

    /******************************DatesCRUD*************************/
    $scope.dates = [];
    $http.get('/api/dates').then(function (response){
        $scope.dates = response.data;
        console.log(response);
    });

    this.del_dates = function del(id) {
        $http.get('/api/dates/del?id=' + id).then(function (response) {
            window.location.reload();
        });
    };

    this.start_insert_dates = function add() {

        $http.get('/api/order_status').then(function (response){
            var orderStatus = response.data;
            var selector = document.getElementById("orderStatusID");
            $(selector).empty();
            for (var i = 0; i < orderStatus.length; i++) {
                var option = document.createElement("option");
                option.text = orderStatus[i].nameOfStatus;
                option.value = orderStatus[i].id;
                console.log(option);
                selector.add(option);
            }
        });
    };

    this.insert_date = function add() {
        var id = document.getElementById("datesId").value;
        var dateOfOrdering = document.getElementById("dateOfOrdering").value;
        var dateOfReceiving = document.getElementById("dateOfReceiving").value;
        var indexOfOrderStatus = document.getElementById("orderStatusID").selectedIndex;
        var orderStatus = document.getElementById("orderStatusID").options[indexOfOrderStatus].value

        $http.get('/api/dates/add?id='+id+'&dateOfOrdering='+dateOfOrdering+'&dateOfReceiving='
            +dateOfReceiving+'&orderStatus_id='+orderStatus).then(function (response){
            setTimeout(function(){
                window.location.reload();
            });
        });
    };
});