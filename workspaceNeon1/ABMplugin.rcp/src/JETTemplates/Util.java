package JETTemplates;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.sound.sampled.BooleanControl;

import maia.ontologicalStructure.*;

public class Util
{
	public static String Capitalize(String s)
	{
		return s.substring(0,1).toUpperCase() + s.substring(1)  ; 
	}
	public static String GetPropertyTypeName(maia.ontologicalStructure.Property prop){
		
		// available types are string/boolean/number
		String propertyTypeName = "";
				
		if (prop instanceof BooleanProperty)
		{
			propertyTypeName = "boolean";
		}
		else if (prop instanceof NumberProperty)
		{
			propertyTypeName = "double";
		}
		else if (prop instanceof StringProperty)
		{
			propertyTypeName = "String";
		}
		else
		{
			propertyTypeName = "Erooooooor cannot detect property name";
		}
		return propertyTypeName;
	}
	
	public static String GetPropertyValue(maia.ontologicalStructure.Property prop)
	{
		String propValue = "";
		
		if (prop instanceof StringProperty)
		{
			propValue = String.format("\"%s\"", ((StringProperty)prop).getValue());
		}
		else if (prop instanceof NumberProperty)
		{
			propValue =Double.toString(((NumberProperty)prop).getValue());
		}
		else if (prop instanceof BooleanProperty)
		{
			propValue =Boolean.toString(((BooleanProperty)prop).isValue());
		}
		else
		{
			propValue = "Erooooooor cannot detect property value";
		}
		
		return propValue;
	}
	 //CUSTOM NON JET ADDED
	  public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		    return map.entrySet()
		              .stream()
		              .sorted(Map.Entry.comparingByValue(/*Collections.reverseOrder()*/))
		              .collect(Collectors.toMap(
		                Map.Entry::getKey, 
		                Map.Entry::getValue, 
		                (e1, e2) -> e1, 
		                LinkedHashMap::new
		              ));
		}
}
