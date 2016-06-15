<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2">MENU</div>
		<div class="span10">


			<legend>Formulario Producto : ${opc}</legend>
			<form:form commandName="product" action="saveProduct" method="POST">
			
			<input type="text" name="id" id="id" value="${product.id}">

				<table>
				
					<tr>
						<td>Producto:</td>
						<td><form:input path="productName" id="productName" />
						<td />
					</tr>

					<tr>
						<td>Descripcion: </td>
						<td><form:input path="description" id="description" />
						<td />
					</tr>
				
					<tr>
						<td>Nombre Hotel: </td>
						<td><form:input path="hotel.businessName" id="businessName" />
						<td />
					</tr>
					<tr>
						<td>RUC Hotel: </td>
						<td><form:input path="hotel.ruc" id="ruc" />
						<td />
					</tr>
					<tr>
						<td>Direccion: </td>
						<td><form:input path="hotel.address" id="address" />
						<td />
					</tr>
					<tr>
						<td>Estado del Hotel: </td>
						<td><form:select path="hotel.statusHotel.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusHotel}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
					</tr>
					
					<tr>
						<td>Estado del Producto:</td>
						<td><form:select path="statusProduct.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusProduct}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
						</tr>
						
						<tr>
						<td>producto:</td>
						<td><form:select path="typeProduct.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${typeProduct}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
						</tr>

					<tr>
						<td colspan="2"><button type="submit" class="btn btn-success">Guardar</button>
						<td />
					</tr>
				</table>

				<%-- DNI: <form:input path="dni" id="dni"/><br> --%>

				<input type="hidden" name="opc" id="opc" value="${opc}">
				<br>


			</form:form>


		</div>
	</div>
</div>