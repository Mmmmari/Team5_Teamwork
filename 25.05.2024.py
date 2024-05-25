# TEAMWORK
# To make a data structure which will hold all instances/objects together
# Print out object data using loops
# Use methods for all objects using loops
# Allow programmer to override the default price of an item

class Shop:
    def __init__(self):
        # Initialize an empty dictionary to store items and their prices
        self.items = {}
      
    
    def add_item(self, item, price):
        # Add the item and its price to the items dictionary
        self.items[item] = price
        
    def print_items(self):
        # Iterate over the items dictionary and print each item and its price
        print('Your shop list is:')
        for item, price in self.items.items():
            print(f'Item: {item}, Price: {price}')
            
    def set_price(self, item, new_price):
        if item in self.items:
            self.items[item] = new_price

# Create an instance of Shop
shop = Shop()

shop.add_item('Sneakers', 30)
shop.add_item('Pants', 50)
shop.add_item('Shirts', 40)


# Print the items dictionary
shop.print_items()

# Override price
shop.set_price('Sneakers', 35)

#print with the new price
shop.print_items()
