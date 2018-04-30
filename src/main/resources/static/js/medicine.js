var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){
    /******************************MedicinesCRUD*************************/
    $scope.medicines = [];
    $http.get('/api/medicine').then(function (response){
        $scope.medicines = response.data;
        console.log(response);
    });

    this.del_medicine = function del(id) {
        $http.get('/api/medicine/del?id=' + id).then(function (response) {
            window.location.reload();
        });
    };

    this.start_insert_medicine = function add() {

        $http.get('/api/type/medicine').then(function (response){
            var types = response.data;
            var selector = document.getElementById("typeID");
            $(selector).empty();
            for (var i = 0; i < types.length; i++) {
                var option = document.createElement("option");
                option.text = types[i].nameOfType;
                option.value = types[i].id;
                console.log(option);
                selector.add(option);
            }
        });
    };

    this.insert_medicine = function add() {
        var id = document.getElementById("medicineID").value;
        var nameOfMedicine = document.getElementById("medicineName").value;
        var indexOfType = document.getElementById("typeID").selectedIndex;
        var typeOfMedicineID = document.getElementById("typeID").options[indexOfType].value;
        var criticalRate = document.getElementById("criticalRate").value;
        var amount = document.getElementById("amount").value;
        var price = document.getElementById("price").value;
        var manufactureDate = document.getElementById("manufactureDate").value;
        var expirationTerm = document.getElementById("expirationTerm").value;


        $http.get('/api/medicine/add?id='+id+'&nameOfMedicine='+nameOfMedicine
            +'&type_id='+typeOfMedicineID+'&criticalRate='+criticalRate+'&amount='+amount
            +'&price='+price+'&manufactureDate='+manufactureDate+'&expirationTerm='+expirationTerm)
            .then(function (response){
                window.location.reload();
        });
    };

});