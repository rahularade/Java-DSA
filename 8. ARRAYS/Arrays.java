public class Arrays{
    public static void main(String[] args) {
        int marks[]=new int[5];
        marks[0]=95;
        marks[1]=96;
        marks[2]=99;

        System.out.println("Physics : "+marks[0]);
        System.out.println("Chemistry : "+marks[1]);
        System.out.println("Math : "+marks[2]);
        
        marks[2]=100;
        System.out.println("Math : "+marks[2]);

        int avg=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage : "+avg+"%");

        System.out.println("Length of Array : "+marks.length);

    }
}