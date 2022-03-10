public class TaskFikireyesus
{
    public static void main(String[]args)
    {
        int amountOfBricks=55;
        int containerCapacity=6;
        int fullContainer;
        int notFullContainer;
        int total;
        notFullContainer=amountOfBricks%containerCapacity;
        System.out.println("The container which is not full is :" + notFullContainer);
        fullContainer=(amountOfBricks/containerCapacity);
        System.out.println("The Full containers are: " + fullContainer);
        total=fullContainer+notFullContainer;
        System.out.println("total(sum of full and not full containers is)" + total);
    }
}
