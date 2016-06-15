<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Bienvenido a la cadena de hoteles

<br>
<a href="frmProduct">Nueva Hotel</a>
<br>
<display:table name="${listProduct}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
 	
 	<display:column title="Producto" property="productName" />
 	<display:column title="Descripcion" property="description" />
 	
	<display:column title="Nombre del Hotel" property="hotel.businessName" />
	<display:column title="Ruc del Hotel" property="hotel.ruc" />
	<display:column title="Direccion del hotel" property="hotel.address" />
	<display:column title="Telefono del Hotel" property="hotel.phone" />
	<display:column title="Sucursales" property="hotel.root" />
	<display:column title="Estado" property="statusProduct.description" />
	<display:column title="Producto" property="typeProduct.description" />
	<display:column title="OPC">
		<a href="editProduct?id=${item.id}">Modificar</a>
		<a href="deleteProduct?id=${item.id}">Eliminar</a>
	</display:column>
	
	
</display:table>