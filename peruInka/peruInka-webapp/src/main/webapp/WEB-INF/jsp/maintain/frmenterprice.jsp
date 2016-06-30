<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2">MENU</div>
		<div class="span10">


			<legend> Formulario empresa : ${opc}</legend>
			<form:form commandName="enterprice" action="saveEnterprice" method="POST">
			
			<input type="text" name="id" id="id" value="${enterprice.id}">

				<table>
					<tr>
						<td>Nombre Empresa: </td>
						<td><form:input path="businessName" id="businessName" />
						<td />
					</tr>
					<tr>
						<td>RUC Empresa: </td>
						<td><form:input path="ruc" id="ruc" />
						<td />
					</tr>
					<tr>
						<td>Telefono: </td>
						<td><form:input path="phone" id="phone" />
						<td />
					</tr>
					<tr>
						<td>creacion: </td>
						<td><form:input path="createdBy" id="createdBy" />
						<td />
					</tr>
					<tr>
						<td>dia de creacion: </td>
						<td><form:input path="dateCreated" id="dateCreated" />
						<td />
					</tr>
					<tr>
						<td>creacion: </td>
						<td><form:input path="dateLastUpdated" id="dateLastUpdated" />
						<td />
					</tr>
					<tr>
						<td>version: </td>
						<td><form:input path="version" id="version" />
						<td />
					</tr>
					
					<tr>
						<td>Estado de la Empresa: </td>
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