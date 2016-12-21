package Templates;

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
}
