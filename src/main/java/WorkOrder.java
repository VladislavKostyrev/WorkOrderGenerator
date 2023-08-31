public class WorkOrder {
    public static double shiftPlanInMm = 9000.0;     //TODO должно быть настраиваемо
    double fullnessWorkOrderInMm = 0;

    public void fillWorkOrder(ProductionOrder[] orders) {
        int i = 0;
        while (fullnessWorkOrderInMm != shiftPlanInMm) {
            if (orders[i].mainWidth > shiftPlanInMm) {
                int a = (int) (shiftPlanInMm / orders[i].quantity);
                //orders[i].fill заполнить наряд этим заказом С УЧЕТОМ а
                break;
            } else if (orders[i].mainWidth == shiftPlanInMm) {
                //orders[i].fill заполнить наряд этим заказом
                break;
            }
            //orders[i].fill заполнить наряд этим заказом
            fullnessWorkOrderInMm += orders[i].mainWidth;
            i++;
        }
    }
}
