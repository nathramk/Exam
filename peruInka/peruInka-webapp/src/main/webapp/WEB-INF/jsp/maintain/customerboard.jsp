<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Cliente

<br>
<a href="frmcustomer">Nuevo cliente</a>
<br>
<display:table name="${listCustomer}" id="item" class="table">

	<display:column title="Codigo" property="id" />

	<display:column title="creado" property="createdBy" />
 	
 	<display:column title="nombre del cliente" property="person.name" />
 	<display:column title="primer apellido" property="person.lastNameF" />
 	<display:column title="segundo apellido" property="person.lastNameM" />
 	
	<display:column title="Nombre de la empresa" property="enterprice.businessName" />
	<display:column title="Ruc de la empresa" property="enterprice.ruc" />
	<display:column title="Direccion de la empresa" property="enterprice.address" />
	<display:column title="Telefono de la empresa" property="enterprice.phone" />
	<display:column title="creacion" property="enterprice.createdBy" />
	<display:column title="fecha de cracion" property="enterprice.dateCreated" />
	<display:column title="fecha de retiro" property="enterprice.dateLastUpdated" />
	<display:column title="version" property="enterprice.version" />
	<display:column title="Estado Del cliente" property="statusCustomer.description" />
	<display:column title="OPC">
		<a href="editHotel?id=${item.id}">Modificar</a>
		<a href="deleteHotel?id=${item.id}">Eliminar</a>
	</display:column>
	
	
</display:table>

