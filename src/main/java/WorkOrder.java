public class WorkOrder {
    public static double shiftPlanInMm = 9000.0;     //TODO ������ ���� ������������
    double fullnessWorkOrderInMm = 0;

    public void fillWorkOrder(ProductionOrder[] orders) {
        int i = 0;
        while (fullnessWorkOrderInMm != shiftPlanInMm) {
            if (orders[i].mainWidth > shiftPlanInMm) {
                int a = (int) (shiftPlanInMm / orders[i].quantity);
                //orders[i].fill ��������� ����� ���� ������� � ������ �
                break;
            } else if (orders[i].mainWidth == shiftPlanInMm) {
                //orders[i].fill ��������� ����� ���� �������
                break;
            }
            //orders[i].fill ��������� ����� ���� �������
            fullnessWorkOrderInMm += orders[i].mainWidth;
            i++;
        }
    }
}
