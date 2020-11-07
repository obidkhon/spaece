public class Iphone {
    int energylavel;
    String name;
    public  Iphone(String iphoneName){
    energylavel=100;
    name=iphoneName;

    }

    public void  newfromTask(String task){
        energylavel=energylavel+15;
        System.out.println(name+" matimatika darsini" + task);

    }


    public String toString(){
        return "Salom men "+name;
    }

    public static void main(String[] args) {
        Iphone Olima=new Iphone("Olima");
        System.out.println(Olima);
 Olima.newfromTask(" qiladi");
        Olima.newfromTask(" yashi ko'radi");
    }
}
