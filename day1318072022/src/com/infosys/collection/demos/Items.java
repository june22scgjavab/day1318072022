package com.infosys.collection.demos;

public class Items implements Comparable<Items> {
private int id;
private String description;
private float itemPrice;


public Items(int id, String description, float itemPrice) {
	super();
	this.id = id;
	this.description = description;
	this.itemPrice = itemPrice;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the description
 */
public String getDescription() {
	return description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}
/**
 * @return the itemPrice
 */
public float getItemPrice() {
	return itemPrice;
}
/**
 * @param itemPrice the itemPrice to set
 */
public void setItemPrice(float itemPrice) {
	this.itemPrice = itemPrice;
}
/*@Override
public int compareTo(Items o) {
	int value=0;
	if(this.id>o.id)
	{
	   value=1;	
	}
	else if(this.id<o.id)
	{
		value=-1;
	}
   return value;
 }*/

public int compareTo(Items o) {
	   //return this.description.compareTo(o.description); //ascending
	return o.description.compareTo(description);  
 }


@Override
public String toString() {
	return "Items [id=" + id + ", description=" + description + ", itemPrice=" + itemPrice + "]";
}

}
