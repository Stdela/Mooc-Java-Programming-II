Warehouse
Create the class Warehouse with the following methods:

public void addProduct(String product, int price, int stock), which adds a product to the warehouse with the price and stock balance given as parameters.
public int price(String product), which returns the price of the product it received as a parameter. If the product hasn't been added to the warehouse, the method must return -99.
The products in the warehouse (and in the next part their stock) must be stored in a variable of the type Map<String, Integer>! 
The object created can be a HashMap, but its type must be the Map-interface, rather than any implementation of that interface.

Products stock balance
Save the stock balance of products in a variable with the Map<String, Integer> type, in the same way the prices were stored. Supplement the warehouse with the following methods:

public int stock(String product) returns the current remaining stock of the product in the warehouse. If the product hasn't been added to the warehouse, the method must return 0.
public boolean take(String product) reduces the stock remaining for the product it received as a parameter by one, and returns true if there was stock remaining. 
If the product was not available in the warehouse the method returns false. A products stock can't go below zero.

Listing the products
Let's add one more method to the warehouse:

public Set<String> products() returns the names of the products in the warehouse as a Set
This method is easy to implement with HashMap. 
You can get the products in the warehouse from either the Map storing the prices or the one storing current stock, by using the method keySet()

Item
Items can be added to the shopping cart (which we'll add soon). An item is a product with a quantity. You for example add an item representing one bread to the cart, or add an item representing 24 coffees.

Create the class Item with the following methods:

public Item(String product, int qty, int unitPrice); a constructor that creates an item corresponding to the product given as a parameter. 
qty tells us how many of the product are in the item, while unitPrice is the price of a single product.
public int price() return the price of the item. You get the items price by multiplying its unit price by its quantity(qty).
public void increaseQuantity increases the quantity by one.
public String toString() returns the string representation of the item. which must match the format shown in the example below.

Shopping cart
We finally get to implement the shopping cart class!

Internally, ShoppingCart stores products added there as Item-objects. 
ShoppingCart must have an instance variable with either the Map<String, Item> type, or the List<Item> type.
Don't add any other instance variable to the ShoppingCart class, besides the List or Map used to store the items.


First let's give ShoppingCart a constructor with no parameters and these methods:

public void add(String product, int price) adds an item to the cart that matches the product given as a parameter, with the price given as a parameter.
public int price() returns the total price of the shopping cart.

One item per product
Let's change our cart so that if a product is being added thats already in the cart, we don't add a new item, 
but instead update item already in the cart by calling its increaseQuantity() method.
