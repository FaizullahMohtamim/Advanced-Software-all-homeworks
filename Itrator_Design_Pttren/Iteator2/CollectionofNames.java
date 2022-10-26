/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Itrator_Design_Pttren.Iteator2;

/**
 *
 * @author Mohtamim
 */
public class CollectionofNames implements Container {
public String name[]={"Faiz", "Hamraz","Qadri","khalid"}; 
	
@Override
	public Iterator getIterator() {
		return new CollectionofNamesIterate() ;
	}
	private class CollectionofNamesIterate implements Iterator{
		int i;
		@Override
		public boolean hasNext() {
			if (i<name.length){
				return true;
			}
			return false;
		}
		@Override
		public Object next() {
			if(this.hasNext()){
	            return name[i++];
			}
		    return null;	
		}
	}
}


