package Testing;

 class TestOrganism {
   public static void main(String[] args) {
      Organism shark = new Fish(5, "Leopard Shark");
      Organism org = new Organism();
       shark.print();
       org.print();
    }
 }
 class Fish extends Organism {
    int fins;
    Fish(int nFins, String name)
    {
      fins = nFins;
       this.name = name;
    }
    public void print() {
     System.out.println(this.name);
      System.out.println(this.fins);
   }
 }
 class Organism {
    String name;
    Organism() {
       name = "Organism";
    }
    public void print() {
       System.out.println(this.name); 
    }
 }
