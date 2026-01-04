public class array1 {
    void demoArrays(){
        int[] ages = new int[3];
        System.out.println (ages[0] = 34);
        System.out.println (ages[1] = 22);
        System.out.println (ages[2] = 36);
    
        

    
    for(int i =0; i<3; i++){
        System.out.println(ages[i]);
    }
    for (int age :ages){
        System.out.println(age);

    }
    int i =0;
    while (i<3){
        System.out.println( ages[i]);
        i=i+1;
    }
}
    public  static void main(String[] args){
        array1 obj = new array1();
        obj.demoArrays();

    }
}


