package com.telusko;

     public class Menu {
                private int table ;
                @Override
				public String toString() {
					return "Menu [table=" + table + ", Recepie=" + Recepie + ", Price=" + Price + "]";
				}
				public int getTable() {
					return table;
				}
				public void setTable(int table) {
					this.table = table;
				}
				public String getRecepie() {
					return Recepie;
				}
				public void setRecepie(String recepie) {
					Recepie = recepie;
				}
				public int getPrice() {
					return Price;
				}
				public void setPrice(int price) {
					Price = price;
				}
				private String Recepie;
                private int Price;
 
}
