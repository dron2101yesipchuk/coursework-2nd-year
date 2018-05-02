var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){

    /******************************BuyerHasMedicinesCRUD*************************/
    $scope.buyer_has_medicines = [];
    $http.get('/api/buyer_has_medicines').then(function (response){
        $scope.buyer_has_medicines = response.data;
        console.log(response);
    });

    this.del_buyer_has_medicines = function del(id) {
        $http.get('/api/buyer_has_medicines/del?id=' + id).then(function (response) {
            window.location.reload();
        });
    };

    this.start_insert_buyer_has_medicines = function add() {

        $http.get('/api/buyers').then(function (response){
            var buyers = response.data;
            var selector = document.getElementById("BuyerID");
            $(selector).empty();
            for (var i = 0; i < buyers.length; i++) {
                var option = document.createElement("option");
                option.text = buyers[i].pib;
                option.value = buyers[i].id;
                console.log(option);
                selector.add(option);
            }


            $http.get('/api/medicine').then(function (response){
                var medicines = response.data;
                var selector = document.getElementById("MedicineID");
                $(selector).empty();
                for (var i = 0; i < medicines.length; i++) {
                    var option = document.createElement("option");
                    option.text = medicines[i].nameOfMedicine;
                    option.value = medicines[i].id;
                    console.log(option);
                    selector.add(option);
                }


                $http.get('/api/dates').then(function (response){
                    var dates = response.data;
                    var selector = document.getElementById("DateID");
                    $(selector).empty();
                    for (var i = 0; i < dates.length; i++) {
                        var option = document.createElement("option");
                        option.text = dates[i].dateOfOrdering + "; " + dates[i].dateOfReceiving + "; "
                            + dates[i].orderStatus.nameOfStatus;
                        option.value = dates[i].id;
                        console.log(option);
                        selector.add(option);
                    }
                });
            });
        });
    };

    this.insert_buyer_has_medicines = function add() {
        var id = document.getElementById("id").value;
        var indexOfBuyer = document.getElementById("BuyerID").selectedIndex;
        var buyer_id = document.getElementById("BuyerID").options[indexOfBuyer].value;
        var indexOfMedicine = document.getElementById("MedicineID").selectedIndex;
        var medicine_id = document.getElementById("MedicineID").options[indexOfMedicine].value;
        var indexOfDates = document.getElementById("DateID").selectedIndex;
        var dates_id = document.getElementById("DateID").options[indexOfDates].value;
        var doctorPIB = document.getElementById("doctorPIB").value;
        var diagnosis = document.getElementById("diagnosis").value;
        var amount = document.getElementById("amountOfMedicine").value;


        $http.get('/api/buyer_has_medicines/add?id='+id+'&buyer_id='+buyer_id+'&medicine_id='
            +medicine_id+'&dates_id='+dates_id+'&doctorPIB='+doctorPIB+'&diagnosis='+diagnosis+
            '&amount='+amount).then(function (response){
                window.location.reload();
        });
    };

    var idBuyersHasMedicines;
    this.start_update_buyer_has_medicines = function updt(id, doctorPIB, diagnosis, amount){
        idBuyersHasMedicines = id;

        $http.get('/api/buyers').then(function (response){
            var buyers = response.data;
            var selector = document.getElementById("BuyerIDUPD");
            $(selector).empty();
            for (var i = 0; i < buyers.length; i++) {
                var option = document.createElement("option");
                option.text = buyers[i].pib;
                option.value = buyers[i].id;
                console.log(option);
                selector.add(option);
            }


            $http.get('/api/medicine').then(function (response){
                var medicines = response.data;
                var selector = document.getElementById("MedicineIDUPD");
                $(selector).empty();
                for (var i = 0; i < medicines.length; i++) {
                    var option = document.createElement("option");
                    option.text = medicines[i].nameOfMedicine;
                    option.value = medicines[i].id;
                    console.log(option);
                    selector.add(option);
                }


                $http.get('/api/dates').then(function (response){
                    var dates = response.data;
                    var selector = document.getElementById("DateIDUPD");
                    $(selector).empty();
                    for (var i = 0; i < dates.length; i++) {
                        var option = document.createElement("option");
                        option.text = dates[i].dateOfOrdering + "; " + dates[i].dateOfReceiving + "; "
                            + dates[i].orderStatus.nameOfStatus;
                        option.value = dates[i].id;
                        console.log(option);
                        selector.add(option);
                    }
                });
            });
        });

        document.getElementById("doctorPIBUPD").value = doctorPIB;
        document.getElementById("diagnosisUPD").value = diagnosis;
        document.getElementById("amountOfMedicineUPD").value = amount;
    };

    this.update_buyer_has_medicines = function upd(){
        var indexOfBuyer = document.getElementById("BuyerIDUPD").selectedIndex;
        var buyer_id = document.getElementById("BuyerIDUPD").options[indexOfBuyer].value;
        var indexOfMedicine = document.getElementById("MedicineIDUPD").selectedIndex;
        var medicine_id = document.getElementById("MedicineIDUPD").options[indexOfMedicine].value;
        var indexOfDates = document.getElementById("DateIDUPD").selectedIndex;
        var dates_id = document.getElementById("DateIDUPD").options[indexOfDates].value;
        var doctorPIB = document.getElementById("doctorPIBUPD").value;
        var diagnosis = document.getElementById("diagnosisUPD").value;
        var amount = document.getElementById("amountOfMedicineUPD").value;


        $http.get('/api/buyer_has_medicines/upd?id='+idBuyersHasMedicines+'&buyer_id='+buyer_id+'&medicine_id='
            +medicine_id+'&dates_id='+dates_id+'&doctorPIB='+doctorPIB+'&diagnosis='+diagnosis+
            '&amount='+amount).then(function (response){
            window.location.reload();
        });
    };
});