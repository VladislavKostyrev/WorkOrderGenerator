public class ProductionOrder {
    //TODO добавить массив заказов
    //TODO добавить метод который заполняет все заказы из массива заказов
    String type;
    String name;
    double widthInMm;
    int quantity;
    double mainWidth;
    String dateShipment;

    public void fillProductionOrder() {
        this.name = "PLR 150/100-50";
        this.dateShipment = "28.08.2023";   //TODO Вместо значений должны быть ссылки на методы извлечения данных с таблицы
        this.type = "TYPE_OLR";
        this.quantity = 10;
        this.widthInMm = 50.0;

        mainWidth = widthInMm * quantity;
    }
}
