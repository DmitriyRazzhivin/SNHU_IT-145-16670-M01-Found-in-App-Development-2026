package ShoppingCart;

public class ItemToPurchase {
    //Private fields - itemName, itemPrice, and itemQuanity
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    /*Default Constructor
     itemName - Initialized to "none"
     itemPrice - Initialized to 0
     itemQuantity - Initialized ito 0
    */
    public ItemToPurchase(){
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;

    }

    //public member methods (mutators & accessors)

    //setName() & getName()
    //setPrice() & getPrice()
    //setQuantity() & getQuantity()
    public void setName(String name) {this.itemName = name; }
    public String getName() {return itemName; }

    public void setPrice(int price) {this.itemPrice = price; }
    public int getPrice() { return itemPrice; }

    public void setQuantity(int quantity) {this.itemQuantity = quantity; }
    public int getQuantity() {return itemQuantity; }

    //print item to purchase

    public void printItemPurchase() {
        System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +
                " = $" + (itemPrice * itemQuantity));
    }
}
