var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){
    /******************************TypeOfMedicineCRUD*************************/
    $scope.typeOfMedicine = [];
    $http.get('/api/type/medicine').then(function (response){
        $scope.typeOfMedicine = response.data;
        console.log(response);
    });

    this.del_type_of_medicine = function del(id) {
        $http.get('/api/type/medicine/del?id=' + id).then(function (response) {
            window.location.reload();
        });
    };

    this.start_insert_type_of_medicine = function add() {

        $http.get('/api/general_types').then(function (response){
            var types = response.data;
            var selector = document.getElementById("generalType");
            $(selector).empty();
            for (var i = 0; i < types.length; i++) {
                var option = document.createElement("option");
                option.text = types[i].nameOfGeneralType;
                option.value = types[i].id;
                console.log(option);
                selector.add(option);
            }

                $http.get('/api/type/production').then(function (response){
                    var types = response.data;
                    var selector = document.getElementById("productionType");
                    $(selector).empty();
                    for (var i = 0; i < types.length; i++) {
                        var option = document.createElement("option");
                        option.text = types[i].nameOfType;
                        option.value = types[i].id;
                        console.log(option);
                        selector.add(option);
                    }
                });
            });
    };

    this.insert_type_of_medicine = function add() {
        var id = document.getElementById("id").value;
        var typeName = document.getElementById("typeName").value;
        var indexOfGeneralType = document.getElementById("generalType").selectedIndex;
        var general_type_id = document.getElementById("generalType").options[indexOfGeneralType].value;
        var indexOfProductionType = document.getElementById("productionType").selectedIndex;
        var production_type_id = document.getElementById("productionType").options[indexOfProductionType].value;


        $http.get('/api/type/medicine/add?id='+id+'&nameOfType='+typeName+'&gen_type_id='
            +general_type_id+'&production_id='+production_type_id).then(function (response){
            window.location.reload();
        });
    };
});