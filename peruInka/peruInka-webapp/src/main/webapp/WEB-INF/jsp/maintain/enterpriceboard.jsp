<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Empresas

<br>
<a href="frmenterprice">Nueva empresa</a>
<br>
<display:table name="${listEnterprice}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Nombre de la empresa" property="businessName" />
	<display:column title="Ruc de la empresa" property="ruc" />
	<display:column title="Direccion de la empresa" property="address" />
	<display:column title="Telefono de la empresa" property="phone" />
	<display:column title="creacion" property="createdBy" />
	<display:column title="Sucursales" property="dateCreated" />
	<display:column title="Sucursales" property="dateLastUpdated" />
	<display:column title="Sucursales" property="lastUpdatedBy" />
	<display:column title="Sucursales" property="version" />
	<display:column title="Estado De la empresa" property="statusEnterprice.description" />
	<display:column title="OPC">
		<a href="editHotel?id=${item.id}">Modificar</a>
		<a href="deleteHotel?id=${item.id}">Eliminar</a>
	</display:column>
	
	
</display:table>

