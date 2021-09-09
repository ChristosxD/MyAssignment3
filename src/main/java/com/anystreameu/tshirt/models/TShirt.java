
package com.anystreameu.tshirt.models;


public class TShirt {
    private String brand;
    private Color color;
    private Size size;
    private Fabric fabric;
    private double price;

    public TShirt(String brand) {
       
        this.brand = brand;


    }


   
    public TShirt(String brand,Color color, Size size, Fabric fabric) {
        double starterPrice = 20;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.fabric = fabric;  
        this.price = starterPrice + getColor().getPrice()
                                  + getSize().getPrice()
                                  + getFabric().getPrice(); 
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TShirt{brand=").append(brand);
        sb.append(", color=").append(color);
        sb.append(", size=").append(size);
        sb.append(", fabric=").append(fabric);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
    


    
    
    
}
