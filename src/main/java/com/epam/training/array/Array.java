package com.epam.training.array;

//TODO: write a wrapper class for a java int array, make this class immutable
public class Array {
  
  private int[] items;

  public Array() {
    setItems(getItems());
  }

  public Array(int[] items){
    setItems(items);
  }

  public int getArrayLength(){
    return items.length;
  }

  public int getElement(int index){
    return items[index];
  }

  public int[] getItems() {
    for(int i = 0; i < getArrayLength(); i++){
      items[i] = getElement(i);
    }
    return items;
  }

  public void setItems(int[] items) {
    this.items = items;
  }
}
