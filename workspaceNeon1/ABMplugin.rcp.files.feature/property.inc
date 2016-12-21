private <%=methodPrefix%> <%=Util.GetPropertyTypeName(prop)%> <%=prop.getLabel()%> = <%=Util.GetPropertyValue(prop)%>;
	public <%=methodPrefix%> <%=Util.GetPropertyTypeName(prop)%> get<%=Util.Capitalize(prop.getLabel())%>(){
		return <%=prop.getLabel()%>;
	}
	public <%=methodPrefix%> void set<%=Util.Capitalize(prop.getLabel())%>(<%=Util.GetPropertyTypeName(prop)%> value){
		<%=prop.getLabel()%> = value;
	}
