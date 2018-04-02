package com.yesipchuk.demo.datastorage;

import com.yesipchuk.demo.model.*;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class DataStorageFake {
    private List<Buyer> buyers = new ArrayList<>(
            Arrays.asList(
            new Buyer(1,"Єсипчук Андрій Євгенович", 19),
            new Buyer(2,"Осадчук Роман Романович", 18),
            new Buyer(3,"Іванюк Андрій Ігорович", 19),
            new Buyer(4,"Гуменюк Станіслав Ігорович", 19),
            new Buyer(5,"Абдул Салім Рауфович", 18),
            new Buyer(6,"Баб'юк Петро Юрійович", 18),
            new Buyer(7,"Базалюк Віталій Іванович", 18),
            new Buyer(8,"Бузілов Олексій Валентинович", 20),
            new Buyer(9,"Вишиван Валентин Анатолійович", 21),
            new Buyer(10,"Гаврилюк Богдан Віталійович", 18),
            new Buyer(11,"Горшовський Мартин Васильович", 19),
            new Buyer(12,"Долженко Валерія Юріївна", 19),
            new Buyer(13,"Гунько Віталій Сидорович", 19),
            new Buyer(14,"Дронь Віталій Віталійович", 19),
            new Buyer(15,"Лакуста Володимир Юрійович", 20)
    ));

    public List<Buyer> getBuyers(){
        return buyers;
    }
/*
    private List<DatesOfOrderingAndReceiving> datesOfOrderingAndReceivingList = new ArrayList<>(
            Arrays.asList(
            new DatesOfOrderingAndReceiving(1, new Date(2017-12-20),new Date(2017-12-25) , this.getOrderStatuses().get(2)),
            new DatesOfOrderingAndReceiving(2, new Date(2017- 1 -20),new Date(2017- 1 -21) , this.getOrderStatuses().get(0)),
            new DatesOfOrderingAndReceiving(3, new Date(2017-9-21),new Date(2017-10-25) , this.getOrderStatuses().get(0)),
            new DatesOfOrderingAndReceiving(4, new Date(2017- 6 -15),new Date(2017- 6 -20) , this.getOrderStatuses().get(0)),
            new DatesOfOrderingAndReceiving(5, new Date(2017- 4 -11),new Date(2017-5-20) , this.getOrderStatuses().get(0)),
            new DatesOfOrderingAndReceiving(6, new Date(2017- 7 -20),new Date(2017- 9 - 1) , this.getOrderStatuses().get(0)),
            new DatesOfOrderingAndReceiving(7, new Date(2017- 1 -20),new Date(2017- 1 -31) , this.getOrderStatuses().get(2)),
            new DatesOfOrderingAndReceiving(8, new Date(2017- 3 -10),new Date(2017- 3 -20) , this.getOrderStatuses().get(0)),
            new DatesOfOrderingAndReceiving(9, new Date(2017- 1 -20),new Date(2017- 1 -20) , this.getOrderStatuses().get(0)),
            new DatesOfOrderingAndReceiving(10, new Date(2017- 2 -20),new Date(2017- 2 -22) , this.getOrderStatuses().get(0)),
            new DatesOfOrderingAndReceiving(11, new Date(2018- 2 -20),new Date(2018-3-17) , this.getOrderStatuses().get(1)),
            new DatesOfOrderingAndReceiving(12, new Date(2017- 3 -29),new Date(2017- 4 - 5) , this.getOrderStatuses().get(0)),
            new DatesOfOrderingAndReceiving(13, new Date(2017- 7 -20),new Date(2017- 7 -20) , this.getOrderStatuses().get(0)),
            new DatesOfOrderingAndReceiving(14, new Date(2018- 1 -20),new Date(2018- 3 -17) , this.getOrderStatuses().get(1)),
            new DatesOfOrderingAndReceiving(15, new Date(2016-12-20),new Date(2017- 1 -27) , this.getOrderStatuses().get(0)),
            new DatesOfOrderingAndReceiving(16, new Date(2018- 3 -10),new Date(2018- 3 -15) , this.getOrderStatuses().get(3)),
            new DatesOfOrderingAndReceiving(17, new Date(2017-12-25),new Date(2018- 1 -10) , this.getOrderStatuses().get(0)),
            new DatesOfOrderingAndReceiving(18, new Date(2018- 3 -10),new Date(2018- 3 -14) , this.getOrderStatuses().get(3))
    ));

    public List<DatesOfOrderingAndReceiving> getDatesOfOrderingAndReceiving(){
        return datesOfOrderingAndReceivingList;
    }
*/
    private List<OrderStatus> orderStatuses = new ArrayList<>(
            Arrays.asList(
            new OrderStatus(1,"Отриманий"),
            new OrderStatus(2,"Очікує прибуття"),
            new OrderStatus(3,"Не забраний"),
            new OrderStatus(4,"Виготовляється")
    ));

    public List<OrderStatus> getOrderStatuses(){
        return orderStatuses;
    }

    private List<GeneralTypeOfMedicine> generalTypeOfMedicineList = new ArrayList<>(
            Arrays.asList(
                    new GeneralTypeOfMedicine(1, "Готові ліки"),
                    new GeneralTypeOfMedicine(2, "Вироблені аптекою")
            ));

    public List<GeneralTypeOfMedicine> getGeneralTypesOfMedicine(){
        return generalTypeOfMedicineList;
    }

    private List<TypeOfProduction> typeOfProductionList = new ArrayList<>(
            Arrays.asList(
                    new TypeOfProduction(1, "Змішування"),
                    new TypeOfProduction(2, "Змішування і відстоювання"),
                    new TypeOfProduction(3, "Не виробляється вручну")
            ));

    public List<TypeOfProduction> getTypesOfProduction(){
        return typeOfProductionList;
    }

    private List<TypeOfUsing> typeOfUsingList = new ArrayList<>(
            Arrays.asList(
                    new TypeOfUsing(1, "Внутрішнє"),
                    new TypeOfUsing(2, "Зовнішнє"),
                    new TypeOfUsing(3, "Змішування з іншими ліками")
            ));

    public List<TypeOfUsing> getTypesOfUsing(){
        return typeOfUsingList;
    }

    private List<TypeOfMedicine> typeOfMedicineList = new ArrayList<>(
            Arrays.asList(
                    new TypeOfMedicine(1, "Таблетки", this.generalTypeOfMedicineList.get(0), this.typeOfProductionList.get(2)),
                    new TypeOfMedicine(2, "Мазі", this.generalTypeOfMedicineList.get(0), this.typeOfProductionList.get(2)),
                    new TypeOfMedicine(3, "Настойки", this.generalTypeOfMedicineList.get(0), this.typeOfProductionList.get(2)),
                    new TypeOfMedicine(4, "Мікстури", this.generalTypeOfMedicineList.get(1), this.typeOfProductionList.get(1)),
                    new TypeOfMedicine(5, "Мазі", this.generalTypeOfMedicineList.get(1), this.typeOfProductionList.get(0)),
                    new TypeOfMedicine(6, "Розчини", this.generalTypeOfMedicineList.get(1), this.typeOfProductionList.get(1)),
                    new TypeOfMedicine(7, "Настойки", this.generalTypeOfMedicineList.get(1), this.typeOfProductionList.get(1)),
                    new TypeOfMedicine(8, "Порошки", this.generalTypeOfMedicineList.get(1), this.typeOfProductionList.get(0))

            ));

    public List<TypeOfMedicine> getTypesOfMedicine(){
        return typeOfMedicineList;
    }

        private List<TypeOfMedicineHasTypeOfUsing> typeOfMedicineHasTypeOfUsingList = new ArrayList<>(
                Arrays.asList(
                        new TypeOfMedicineHasTypeOfUsing(this.typeOfMedicineList.get(0), this.typeOfUsingList.get(0)),
                        new TypeOfMedicineHasTypeOfUsing(this.typeOfMedicineList.get(2), this.typeOfUsingList.get(0)),
                        new TypeOfMedicineHasTypeOfUsing(this.typeOfMedicineList.get(3), this.typeOfUsingList.get(0)),
                        new TypeOfMedicineHasTypeOfUsing(this.typeOfMedicineList.get(4), this.typeOfUsingList.get(0)),
                        new TypeOfMedicineHasTypeOfUsing(this.typeOfMedicineList.get(5), this.typeOfUsingList.get(0)),
                        new TypeOfMedicineHasTypeOfUsing(this.typeOfMedicineList.get(6), this.typeOfUsingList.get(0)),
                        new TypeOfMedicineHasTypeOfUsing(this.typeOfMedicineList.get(7), this.typeOfUsingList.get(0)),
                        new TypeOfMedicineHasTypeOfUsing(this.typeOfMedicineList.get(1), this.typeOfUsingList.get(1)),
                        new TypeOfMedicineHasTypeOfUsing(this.typeOfMedicineList.get(2), this.typeOfUsingList.get(1)),
                        new TypeOfMedicineHasTypeOfUsing(this.typeOfMedicineList.get(5), this.typeOfUsingList.get(1)),
                        new TypeOfMedicineHasTypeOfUsing(this.typeOfMedicineList.get(6), this.typeOfUsingList.get(1)),
                        new TypeOfMedicineHasTypeOfUsing(this.typeOfMedicineList.get(5), this.typeOfUsingList.get(2))

                ));

        public List<TypeOfMedicineHasTypeOfUsing> getTypeOfMedicineHasTypeOfUsingList(){
            return typeOfMedicineHasTypeOfUsingList;
        }

    private List<Ingredients> ingredients = new ArrayList<>(
            Arrays.asList(
                    new Ingredients(1,"Листя малини", 20, 100, 10d),
                    new Ingredients(2,"Корінь алтея", 100, 500, 5d),
                    new Ingredients(3,"Цвіт ромашки", 50, 100, 3.5d),
                    new Ingredients(4,"Мед", 100, 400, 20d),
                    new Ingredients(5,"Часник", 100, 300, 30d),
                    new Ingredients(6,"Мед спирт", 20, 25, 20d),
                    new Ingredients(7,"Свинне сало", 300, 300, 10d),
                    new Ingredients(8,"Іхтіолова мазь", 500, 400, 15d),
                    new Ingredients(9,"Сік алое", 400, 700, 7.5d),
                    new Ingredients(10,"Каланхое", 300, 500, 12.5d),
                    new Ingredients(11,"Морська сіль", 500, 400, 10.75d),
                    new Ingredients(12,"Кора верби", 100, 300, 13d),
                    new Ingredients(13,"Листя винограду", 400, 399, 17d),
                    new Ingredients(14,"Редька", 230, 250, 4d),
                    new Ingredients(15,"Цукор", 300, 100, 6d)
            ));

    public List<Ingredients> getIngredients(){
        return ingredients;
    }
/*
    private List<Medicine> medicines = new ArrayList<>(
            Arrays.asList(
                    new Medicine(1, "Аспірін", this.typeOfMedicineList.get(0), 10, 25, 10.5d, new Date(2016-3-1), 36),
                    new Medicine(2, "Біопарокс", this.typeOfMedicineList.get(2), 15, 15, 20d, new Date(2017- 7 -8), 12),
                    new Medicine(3, "Евказалін", this.typeOfMedicineList.get(2), 12, 10, 75d, new Date(2018- 1 -21), 16),
                    new Medicine(4, "Накспрей", this.typeOfMedicineList.get(2), 14, 13, 80d, new Date(2018- 3 - 1), 14),
                    new Medicine(5, "Супрастін", this.typeOfMedicineList.get(0), 5, 10, 57d, new Date(2017-12-25), 24),
                    new Medicine(6, "Левоміцитин", this.typeOfMedicineList.get(0), 8, 6, 30d, new Date(2017-12-24), 12),
                    new Medicine(7, "Ношпа", this.typeOfMedicineList.get(0), 10, 30, 90d, new Date(2015-10-15), 24),
                    new Medicine(8, "Настойка пустирника", this.typeOfMedicineList.get(2), 6, 25, 150d, new Date(2017- 1 -17), 10),
                    new Medicine(9, "Ламізил", this.typeOfMedicineList.get(1), 5, 8, 70d, new Date(2017-9-12), 20),
                    new Medicine(10, "Рецепт10", this.typeOfMedicineList.get(3), 0, 0, 10d, null, 2),
                    new Medicine(11, "Рецепт11", this.typeOfMedicineList.get(4), 0, 0, 52.5d, null, 3),
                    new Medicine(12, "Рецепт12", this.typeOfMedicineList.get(5), 0, 0, 23.25d, null, 5),
                    new Medicine(13, "Рецепт13", this.typeOfMedicineList.get(6), 0, 0, 50d, null, 4),
                    new Medicine(14, "Рецепт14", this.typeOfMedicineList.get(6), 0, 0, 30d, null, 10),
                    new Medicine(15, "Рецепт15", this.typeOfMedicineList.get(7), 0, 0, 25d, null, 7),
                    new Medicine(16, "Мазь вишневського", this.typeOfMedicineList.get(1), 10, 29, 40d, new Date(2015- 3 -26), 24),
                    new Medicine(17, "Рецепт17", this.typeOfMedicineList.get(7), 0, 0, 26d, null, 5)
            ));

    public List<Medicine> getMedicines(){
        return medicines;
    }

    private List<MedicineHasIngredients> medicineHasIngredients = new ArrayList<>(
            Arrays.asList(
                    new MedicineHasIngredients(this.medicines.get(9), this.ingredients.get(13), 50),
                    new MedicineHasIngredients(this.medicines.get(9), this.ingredients.get(14), 100),
                    new MedicineHasIngredients(this.medicines.get(10), this.ingredients.get(3), 75),
                    new MedicineHasIngredients(this.medicines.get(10), this.ingredients.get(6), 150),
                    new MedicineHasIngredients(this.medicines.get(10), this.ingredients.get(7), 200),
                    new MedicineHasIngredients(this.medicines.get(10), this.ingredients.get(8), 90),
                    new MedicineHasIngredients(this.medicines.get(11), this.ingredients.get(9), 100),
                    new MedicineHasIngredients(this.medicines.get(11), this.ingredients.get(10), 170),
                    new MedicineHasIngredients(this.medicines.get(12), this.ingredients.get(4), 50),
                    new MedicineHasIngredients(this.medicines.get(12), this.ingredients.get(5), 30),
                    new MedicineHasIngredients(this.medicines.get(13), this.ingredients.get(0), 200),
                    new MedicineHasIngredients(this.medicines.get(13), this.ingredients.get(3), 125),
                    new MedicineHasIngredients(this.medicines.get(14), this.ingredients.get(11), 69),
                    new MedicineHasIngredients(this.medicines.get(16), this.ingredients.get(12), 45)
            ));

    public List<MedicineHasIngredients> getMedicineHasIngredients(){
        return medicineHasIngredients;
    }

    private List<BuyersHasMedicines> buyersHasMedicines = new ArrayList<>(
            Arrays.asList(
                    new BuyersHasMedicines(this.buyers.get(0), this.medicines.get(0), this.datesOfOrderingAndReceivingList.get(0), null, null, 2),
                    new BuyersHasMedicines(this.buyers.get(1), this.medicines.get(2), this.datesOfOrderingAndReceivingList.get(9), null, null, 4),
                    new BuyersHasMedicines(this.buyers.get(2), this.medicines.get(1), this.datesOfOrderingAndReceivingList.get(12), null, null, 1),
                    new BuyersHasMedicines(this.buyers.get(2), this.medicines.get(7), this.datesOfOrderingAndReceivingList.get(12), null, null, 2),
                    new BuyersHasMedicines(this.buyers.get(3), this.medicines.get(3), this.datesOfOrderingAndReceivingList.get(13), null, null, 3),
                    new BuyersHasMedicines(this.buyers.get(3), this.medicines.get(11), this.datesOfOrderingAndReceivingList.get(17), "Мельник М.І.", "Гайморит", 2),
                    new BuyersHasMedicines(this.buyers.get(4), this.medicines.get(4), this.datesOfOrderingAndReceivingList.get(5), null, null, 1),
                    new BuyersHasMedicines(this.buyers.get(4), this.medicines.get(8), this.datesOfOrderingAndReceivingList.get(7), null, null, 3),
                    new BuyersHasMedicines(this.buyers.get(4), this.medicines.get(10), this.datesOfOrderingAndReceivingList.get(1), "Бондаренко П.С.", "Варикоз", 3),
                    new BuyersHasMedicines(this.buyers.get(5), this.medicines.get(2), this.datesOfOrderingAndReceivingList.get(1), null, null, 5),
                    new BuyersHasMedicines(this.buyers.get(5), this.medicines.get(3), this.datesOfOrderingAndReceivingList.get(1), null, null, 2),
                    new BuyersHasMedicines(this.buyers.get(5), this.medicines.get(7), this.datesOfOrderingAndReceivingList.get(2), null, null, 2),
                    new BuyersHasMedicines(this.buyers.get(6), this.medicines.get(5), this.datesOfOrderingAndReceivingList.get(2), null, null, 4),
                    new BuyersHasMedicines(this.buyers.get(6), this.medicines.get(8), this.datesOfOrderingAndReceivingList.get(2), null, null, 1),
                    new BuyersHasMedicines(this.buyers.get(7), this.medicines.get(6), this.datesOfOrderingAndReceivingList.get(3), null, null, 3),
                    new BuyersHasMedicines(this.buyers.get(8), this.medicines.get(2), this.datesOfOrderingAndReceivingList.get(6), null, null, 1),
                    new BuyersHasMedicines(this.buyers.get(8), this.medicines.get(13), this.datesOfOrderingAndReceivingList.get(11), "Мельник М.І.", "Високий тиск", 1),
                    new BuyersHasMedicines(this.buyers.get(9), this.medicines.get(4), this.datesOfOrderingAndReceivingList.get(4), null, null, 3),
                    new BuyersHasMedicines(this.buyers.get(10), this.medicines.get(9), this.datesOfOrderingAndReceivingList.get(8), "Мельник М.І.", "Кашель", 2),
                    new BuyersHasMedicines(this.buyers.get(11), this.medicines.get(13), this.datesOfOrderingAndReceivingList.get(7), "Павленко Н.М.", "Погіршене травлення", 1),
                    new BuyersHasMedicines(this.buyers.get(12), this.medicines.get(10), this.datesOfOrderingAndReceivingList.get(16), "Бондаренко П.С.", "Варикоз", 1),
                    new BuyersHasMedicines(this.buyers.get(12), this.medicines.get(14), this.datesOfOrderingAndReceivingList.get(14), "Клименко Л.С.", "Набряклість", 4),
                    new BuyersHasMedicines(this.buyers.get(13), this.medicines.get(12), this.datesOfOrderingAndReceivingList.get(11), "Бондаренко П.С.", "Гіпертонія", 3),
                    new BuyersHasMedicines(this.buyers.get(13), this.medicines.get(12), this.datesOfOrderingAndReceivingList.get(14), "Бондаренко П.С.", "Гіпертонія", 3),
                    new BuyersHasMedicines(this.buyers.get(14), this.medicines.get(12), this.datesOfOrderingAndReceivingList.get(10), "Бойчук О.М.", "Цукровий діабет", 2),
                    new BuyersHasMedicines(this.buyers.get(14), this.medicines.get(16), this.datesOfOrderingAndReceivingList.get(10), "Клименко Л.С.", "Запалення рани", 5)
            ));

    public List<BuyersHasMedicines> getBuyerHasMedicines(){
        return buyersHasMedicines;
    }

*/
}
