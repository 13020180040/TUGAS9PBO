public class genetic { 
private T nama;
 public Genetic(T nama) {
 this.nama = nama;
 }
 public T getNama() { 
return nama; 
} 
public void setNama(T nama) 
{ 
this.nama = nama; 
}
 }
public class Klien {
public static void main(String[] args) {

geneticGen = new Orang("Wahyuni");
geneticGen = new Orang<>("Wahyuni"); 
geneticGen.setNama("Ayu");
System.out.println(geneticGen.getNama());
} 
}
