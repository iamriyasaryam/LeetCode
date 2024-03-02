public class employee {
    public static void main(String args[]){
        int hours[] = {0,1,2,3,4};
        int target =2;
        employee(hours, target);

    }
    public static void employee(int hours[],int target){
        int employee = 0;
        for(int i=0; i<hours.length; i++){
            if(hours[i]>=target){
                     employee += 1;
            }
        }
        System.out.println("No.of empl achieve target  "  + employee);
    }


}
