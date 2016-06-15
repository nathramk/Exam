<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Bienvenido a la cadena de hoteles

<br>
<a href="frmHotel">Nueva Hotel</a>
<br>
<display:table name="${listHotel}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Nombre del Hotel" property="businessName" />
	<display:column title="Ruc del Hotel" property="ruc" />
	<display:column title="Direccion del hotel" property="address" />
	<display:column title="Telefono del Hotel" property="phone" />
	<display:column title="Sucursales" property="root" />
	<display:column title="Estado Del Hotel" property="statusHotel.description" />
	<display:column title="OPC">
		<a href="editHotel?id=${item.id}">Modificar</a>
		<a href="deleteHotel?id=${item.id}">Eliminar</a>
	</display:column>
	
	
</display:table>