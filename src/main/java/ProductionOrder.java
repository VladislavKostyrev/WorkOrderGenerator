public class ProductionOrder {
    //TODO �������� ������ �������
    //TODO �������� ����� ������� ��������� ��� ������ �� ������� �������
    String type;
    String name;
    double widthInMm;
    int quantity;
    double mainWidth;
    String dateShipment;

    public void fillProductionOrder() {
        this.name = "PLR 150/100-50";
        this.dateShipment = "28.08.2023";   //TODO ������ �������� ������ ���� ������ �� ������ ���������� ������ � �������
        this.type = "TYPE_OLR";
        this.quantity = 10;
        this.widthInMm = 50.0;

        mainWidth = widthInMm * quantity;
    }
}
