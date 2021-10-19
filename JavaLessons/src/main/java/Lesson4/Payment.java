package Lesson4;
//Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.

 class Payment {
     private static Items [] itemsArray;
     private int price;
     private class Items{
         private String itemName;
         private int itemPrice;
         public Items(String itemName, int itemPrice){
             super();
             this.itemName = itemName;
             this.itemPrice = itemPrice;
         }
    }

     public Payment(){
         super();
     }

     public void setPayment(){
         this.price = 0;
         itemsArray = new Items[3];
         itemsArray[0] = new Items("Scotch", 15);
         itemsArray[1] = new Items("Bourbon", 12);
         itemsArray[2] = new Items("Brandy", 7);
         for (int i=0; i<itemsArray.length;i++)
         this.price = this.price + itemsArray[i].itemPrice;
     }
     int getPayment(){
         return this.price;
     }
     public void print() {
         for (int i = 0; i < itemsArray.length; i++)
         System.out.println("1 bottle of " + itemsArray[i].itemName + ",");
     }
}
