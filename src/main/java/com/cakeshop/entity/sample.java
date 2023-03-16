// package com.cakeshop.entity;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.stream.Collectors;

// class Product{
//     private String name;
//     private Double price;
//     private String mname;
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public Double getPrice() {
//         return price;
//     }
//     public void setPrice(Double price) {
//         this.price = price;
//     }
//     public String getMname() {
//         return mname;
//     }
//     public void setMname(String mname) {
//         this.mname = mname;
//     }
//     public Product(String name, Double price, String mname) {
//         this.name = name;
//         this.price = price;
//         this.mname = mname;
//     }
//     @Override
//     public String toString() {
//         return "Product [name=" + name + ", price=" + price + ", mname=" + mname + "]";
//     }
//     public Product() {
//     }
    
// }
// /**
//  * sample
//  */
// public class sample {

//     public static void main(String[] args) {
//         List<Product> p=new ArrayList<Product>();
//         Product a=new Product("Abc",(double)101,"we");
//         Product b=new Product("BBc",(double)10,"we");
//         Product c=new Product("Cdc",(double)90,"we");
//         Product d=new Product("Bad",(double)151,"we");
//         p.add(a);
//         p.add(b);
//         p.add(c);
//         p.add(d);

//         List<Product> z=p.stream().filter(s->s.getName().startsWith("B")).filter(s->s.getPrice()>100).collect(Collectors.toList());
//         for(Product x:z){
//             System.out.println(x);
//         }

//     }
// }

package com.cakeshop.entity;

/**
 * sample
 */
public class sample {

    public static void main(String[] args) {
        String s="abcabcabcabc";
        for(int i=0;i<s.length();i++){
            int a[]=zalgo(s,sustring(s,0,i));

        }
        
    }
    public static int[] zalgo(String s,String z){

        String temp=z+"$"+s;
        
        return null;
    }

    public static String sustring(String s,int a,int b){
        String f="";
        for(int i=a;i<=b;i++){
            f=f+s.charAt(i);
        }
        return f;
    }
}