<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2">MENU</div>
		<div class="span10">


			<legend> Formulario empresa : ${opc}</legend>
			<form:form commandName="customer" action="saveCustomer" method="POST">
			
			<input type="text" name="id" id="id" value="${customer.id}">

				<table>
				
					<tr>
						<td>creacion: </td>
						<td><form:input path="createdBy" id="createdBy" />
						<td />
					</tr>
					<tr>
						<td>creacion: </td>
						<td><form:input path="person.name" id="name" />
						<td />
					</tr>
					<tr>
						<td>creacion: </td>
						<td><form:input path="person.lastNameF" id="lastNameF" />
						<td />
					</tr>
					<tr>
						<td>creacion: </td>
						<td><form:input path="person.lastNameM" id="lastNameM" />
						<td />
					</tr>
					<tr>
						<td>Nombre Empresa: </td>
						<td><form:input path="enterprice.businessName" id="businessName" />
						<td />
					</tr>
					<tr>
						<td>RUC Empresa: </td>
						<td><form:input path="enterprice.ruc" id="ruc" />
						<td />
					</tr>
					<tr>
						<td>Telefono: </td>
						<td><form:input path="enterprice.phone" id="phone" />
						<td />
					</tr>
					<tr>
						<td>creacion: </td>
						<td><form:input path="enterprice.createdBy" id="createdBy" />
						<td />
					</tr>
					<tr>
						<td>dia de creacion: </td>
						<td><form:input path="enterprice.dateCreated" id="dateCreated" />
						<td />
					</tr>
					<tr>
						<td>creacion: </td>
						<td><form:input path="enterprice.dateLastUpdated" id="dateLastUpdated" />
						<td />
					</tr>
					<tr>
						<td>version: </td>
						<td><form:input path="enterprice.version" id="version" />
						<td />
					</tr>
					
					<tr>
						<td>Estado de la Empresa: </td>
						<td><form:select path="enterprice.statusEnterprice.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusEnterprice}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
					</tr>
					
					<tr>
						<td>Estado de la empresa: </td>
						<td><form:select path="statusEnterprice.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusEnterprice}" itemValue="typeCode"
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