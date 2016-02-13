<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@page session="true"%>
<html>
<head>
    <meta charset="utf-8">
    <sec:csrfMetaTags/>
    <title>ABC Courier Tracking System</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Html5TemplatesDreamweaver.com">

    <link href="scripts/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="scripts/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Icons -->
    <link href="scripts/icons/general/stylesheets/general_foundicons.css" media="screen" rel="stylesheet" type="text/css" />  
    <link href="scripts/icons/social/stylesheets/social_foundicons.css" media="screen" rel="stylesheet" type="text/css" />
    <!--[if lt IE 8]>
        <link href="scripts/icons/general/stylesheets/general_foundicons_ie7.css" media="screen" rel="stylesheet" type="text/css" />
        <link href="scripts/icons/social/stylesheets/social_foundicons_ie7.css" media="screen" rel="stylesheet" type="text/css" />
    <![endif]-->
    <link rel="stylesheet" href="scripts/fontawesome/css/font-awesome.min.css">
    <!--[if IE 7]>
        <link rel="stylesheet" href="scripts/fontawesome/css/font-awesome-ie7.min.css">
    <![endif]-->

    <link href="http://fonts.googleapis.com/css?family=Syncopate" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Abel" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Pontano+Sans" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Oxygen" rel="stylesheet" type="text/css">

    <link href="styles/custom.css" rel="stylesheet" type="text/css" />
	<style>
	input,select{
		margin-right:20px;
	}
	</style>
</head>
<body id="pageBody">

<div id="divBoxed" class="container">

    <div class="transparent-bg" style="position: absolute;top: 0;left: 0;width: 100%;height: 100%;z-index: -1;zoom: 1;"></div>

    <div class="divPanel notop nobottom">
            <div class="row-fluid">
                <div class="span12">

                    <div id="divLogo" class="pull-left">
                        <a href="welcome" id="divSiteTitle">ABC Courier Tracking System</a><br />
                        <a href="welcome" id="divTagLine">Your Tag Line Here</a>
                    </div>

                    <div id="divMenuRight" class="pull-right">
                    <div class="navbar">
                        <button type="button" class="btn btn-navbar-highlight btn-large btn-primary" data-toggle="collapse" data-target=".nav-collapse">
                        NAVIGATION <span class="icon-chevron-down icon-white"></span>
                        </button>
                            <div class="nav-collapse collapse">
                            <ul class="nav nav-pills ddmenu">
                            <li><a href="index">Home</a></li>
                            <li><a href="about.html">About</a></li>
							<li class="active dropdown">
                            <a href="page.html" class="dropdown-toggle">Page <b class="caret"></b></a>
                            <ul class="dropdown-menu">                            
                            <li><a href="full.html">Full Page</a></li>
                            <li><a href="2-column.html">Two Column</a></li>
                            <li><a href="3-column.html">Three Column</a></li>
							<li><a href="../documentation/index.html">Documentation</a></li>
							<li class="dropdown">
                            <a href="#" class="dropdown-toggle">Dropdown Item &nbsp;&raquo;</a>
                            <ul class="dropdown-menu sub-menu">
                            <li><a href="#">Dropdown Item</a></li>
                            <li><a href="#">Dropdown Item</a></li>
                            <li><a href="#">Dropdown Item</a></li>
                            </ul>
                            </li>
                            </ul>
                            </li>
						    <li><a href="services.html">Services</a></li>
						    <li><a href="portfolio.html">Portfolio</a></li>						    
                            <li><a href="contact.php">Contact</a></li>
                            </ul>
                            </div>
                        </div>
                    </div>

                </div>
            </div>

            <div class="row-fluid">
                <div class="span12">
                    <div id="contentInnerSeparator"></div>
                </div>
            </div>
    </div>

    <div class="contentArea">

        <div class="divPanel notop page-content">

            <div class="breadcrumbs">
                <a href="index.html">Home</a> &nbsp;/&nbsp; <span>Customers</span>
            </div>

            <div class="row-fluid">
            <!--Edit Main Content Area here-->
                <div class="span12" id="divMain">

                    <h1>Customers</h1>
                    <hr>
					<!--Branch model box -->
					<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h3 id="myModalLabel">Add New Customer</h3>
                    </div>
					<!-- <form class="form" method="post" action=""> -->
                    <div class="modal-body">                       
					    <!-- <input type="text" class="form-control" placeholder="Branch ID" required name="txtBrId" id="txtBrId"> -->
						<br>
						<input type="text" class="form-control" placeholder="Customer SSN" required name="txtStaffID" id="txtSSN">
						<input type="text" class="form-control" placeholder="First Name" required name="txtStreet" id="txtFName">
						<input type="text" class="form-control" placeholder="Last Name" required name="txtStreet" id="txtLName">
						<input type="text" class="form-control" placeholder="Street" required name="txtStreet" id="txtStreet">
						<input type="text" class="form-control" placeholder="City" required name="txtCity" id="txtCity">
						<select class="form-control" name="cmbCountry" id="cmbCountry">
						<option value="NULL">Country</option>
						<option value="AFG">Afghanistan</option>
						<option value="ALA">Åland Islands</option>
						<option value="ALB">Albania</option>
						<option value="DZA">Algeria</option>						
						<option value="AUS">Australia</option>
						<option value="AUT">Austria</option>
						<option value="AZE">Azerbaijan</option>
						<option value="BHS">Bahamas</option>						
						<option value="BTN">Bhutan</option>
						<option value="BRA">Brazil</option>
						<option value="IOT">British Indian Ocean Territory</option>						
						<option value="BDI">Burundi</option>
						<option value="KHM">Cambodia</option>
						<option value="CMR">Cameroon</option>
						<option value="CAN">Canada</option>
						<option value="CPV">Cape Verde</option>
						<option value="CYM">Cayman Islands</option>						
						<option value="TCD">Chad</option>
						<option value="CHL">Chile</option>
						<option value="CHN">China</option>						
						<option value="CUB">Cuba</option>
						<option value="CUW">Curaçao</option>
						<option value="CYP">Cyprus</option>
						<option value="CZE">Czech Republic</option>
						<option value="DNK">Denmark</option>						
						<option value="EGY">Egypt</option>
						<option value="SLV">El Salvador</option>
						<option value="GNQ">Equatorial Guinea</option>						
						<option value="FJI">Fiji</option>
						<option value="FIN">Finland</option>
						<option value="FRA">France</option>
						<option value="DEU">Germany</option>
						<option value="GHA">Ghana</option>						
						<option value="GRC">Greece</option>
						<option value="GRL">Greenland</option>						
						<option value="GUY">Guyana</option>
						<option value="HTI">Haiti</option>						
						<option value="HKG">Hong Kong</option>
						<option value="HUN">Hungary</option>
						<option value="ISL">Iceland</option>
						<option value="IND">India</option>
						<option value="IDN">Indonesia</option>
						<option value="IRN">Iran, Islamic Republic of</option>
						<option value="IRQ">Iraq</option>
						<option value="IRL">Ireland</option>
						<option value="IMN">Isle of Man</option>
						<option value="ISR">Israel</option>
						<option value="ITA">Italy</option>
						<option value="JAM">Jamaica</option>
						<option value="JPN">Japan</option>
						<option value="JEY">Jersey</option>
						<option value="JOR">Jordan</option>
						<option value="KAZ">Kazakhstan</option>
						<option value="KEN">Kenya</option>
						<option value="KIR">Kiribati</option>
						<option value="PRK">Korea, Democratic People's Republic of</option>
						<option value="KOR">Korea, Republic of</option>
						<option value="KWT">Kuwait</option>
						<option value="KGZ">Kyrgyzstan</option>
						<option value="LAO">Lao People's Democratic Republic</option>
						<option value="LVA">Latvia</option>
						<option value="LBN">Lebanon</option>
						<option value="LSO">Lesotho</option>
						<option value="LBR">Liberia</option>
						<option value="LBY">Libya</option>
						<option value="LIE">Liechtenstein</option>
						<option value="LTU">Lithuania</option>
						<option value="LUX">Luxembourg</option>
						<option value="MAC">Macao</option>
						<option value="MKD">Macedonia, the former Yugoslav Republic of</option>
						<option value="MDG">Madagascar</option>
						<option value="MWI">Malawi</option>
						<option value="MYS">Malaysia</option>
						<option value="MDV">Maldives</option>
						<option value="MLI">Mali</option>
						<option value="MLT">Malta</option>
						<option value="MHL">Marshall Islands</option>
						<option value="MTQ">Martinique</option>
						<option value="MRT">Mauritania</option>
						<option value="MUS">Mauritius</option>
						<option value="MYT">Mayotte</option>
						<option value="MEX">Mexico</option>
						<option value="FSM">Micronesia, Federated States of</option>
						<option value="MDA">Moldova, Republic of</option>
						<option value="MCO">Monaco</option>
						<option value="MNG">Mongolia</option>
						<option value="MNE">Montenegro</option>
						<option value="MSR">Montserrat</option>
						<option value="MAR">Morocco</option>
						<option value="MOZ">Mozambique</option>
						<option value="MMR">Myanmar</option>
						<option value="NAM">Namibia</option>
						<option value="NRU">Nauru</option>
						<option value="NPL">Nepal</option>
						<option value="NLD">Netherlands</option>
						<option value="NCL">New Caledonia</option>
						<option value="NZL">New Zealand</option>
						<option value="NIC">Nicaragua</option>
						<option value="NER">Niger</option>
						<option value="NGA">Nigeria</option>
						<option value="NIU">Niue</option>
						<option value="NFK">Norfolk Island</option>
						<option value="MNP">Northern Mariana Islands</option>
						<option value="NOR">Norway</option>
						<option value="OMN">Oman</option>
						<option value="PAK">Pakistan</option>
						<option value="PLW">Palau</option>
						<option value="PSE">Palestinian Territory, Occupied</option>
						<option value="PAN">Panama</option>
						<option value="PNG">Papua New Guinea</option>
						<option value="PRY">Paraguay</option>
						<option value="PER">Peru</option>
						<option value="PHL">Philippines</option>
						<option value="PCN">Pitcairn</option>
						<option value="POL">Poland</option>
						<option value="PRT">Portugal</option>
						<option value="PRI">Puerto Rico</option>
						<option value="QAT">Qatar</option>
						<option value="REU">Réunion</option>
						<option value="ROU">Romania</option>
						<option value="RUS">Russian Federation</option>
						<option value="RWA">Rwanda</option>
						<option value="BLM">Saint Barthélemy</option>						
						<option value="WSM">Samoa</option>
						<option value="SMR">San Marino</option>
						<option value="STP">Sao Tome and Principe</option>
						<option value="SAU">Saudi Arabia</option>						
						<option value="SGP">Singapore</option>
						<option value="SXM">Sint Maarten (Dutch part)</option>
						<option value="SVK">Slovakia</option>						
						<option value="SOM">Somalia</option>
						<option value="ZAF">South Africa</option>
						<option value="ESP">Spain</option>
						<option value="LKA">Sri Lanka</option>
						<option value="SDN">Sudan</option>
						<option value="SUR">Suriname</option>
						<option value="SJM">Svalbard and Jan Mayen</option>
						<option value="SWZ">Swaziland</option>
						<option value="SWE">Sweden</option>
						<option value="CHE">Switzerland</option>
						<option value="SYR">Syrian Arab Republic</option>
						<option value="TWN">Taiwan, Province of China</option>
						<option value="TJK">Tajikistan</option>
						<option value="TZA">Tanzania, United Republic of</option>
						<option value="THA">Thailand</option>
						<option value="TLS">Timor-Leste</option>
						<option value="TGO">Togo</option>						
						<option value="TUR">Turkey</option>
						<option value="TKM">Turkmenistan</option>
						<option value="TCA">Turks and Caicos Islands</option>
						<option value="TUV">Tuvalu</option>
						<option value="UGA">Uganda</option>
						<option value="UKR">Ukraine</option>
						<option value="ARE">United Arab Emirates</option>
						<option value="GBR">United Kingdom</option>
						<option value="USA">United States</option>
						<option value="UMI">United States Minor Outlying Islands</option>
						<option value="URY">Uruguay</option>
						<option value="UZB">Uzbekistan</option>
						<option value="VUT">Vanuatu</option>
						<option value="VEN">Venezuela, Bolivarian Republic of</option>
						<option value="VNM">Viet Nam</option>
						<option value="VGB">Virgin Islands, British</option>
						<option value="VIR">Virgin Islands, U.S.</option>
						<option value="WLF">Wallis and Futuna</option>
						<option value="ESH">Western Sahara</option>
						<option value="YEM">Yemen</option>
						<option value="ZMB">Zambia</option>
						<option value="ZWE">Zimbabwe</option>
					</select>
						<input type="text" class="form-control" placeholder="Postal Code" name="txtPCode" id="txtPCode">
						
						
                    </div>
                    <div class="modal-footer">
                        <button class="btn " data-dismiss="modal">Close</button>
                        <button class="btn" onclick="saveCustomer()">Save</button>
                    </div>
					<!-- </form> -->
                </div>

                <a data-toggle="modal" href="#myModal" class="btn btn-primary btn-large">Add New Customer</a>			
					
					
					<!-- End of branch model-->
							
					<br><br>
					<h3>Customer Info</h3>
					<input type="text" class="form-control" placeholder="Postal Code" name="txtPCode" id="search-person-id">
					<button class="btn" onclick="getCustomerDetails()">Find</button>
					<table class="table table-hover">
					  <thead style="background-color:#ccc;">
						<tr>
						  <th>SSN</th>
						  <th>First name</th>
						  <th>Last name</th>
						  <th>Street</th>
						  <th>City</th>
						  <th>Country</th>
						  <th>Postal code</th>
						</tr>
					  </thead>
					  <tbody id="branch-data">
						<!--
						<tr>
						  <th scope="row">1</th>
						  <td>Mark</td>
						  <td>Otto</td>
						  <td>Otto</td>
						  <td>@mdo</td>
						  <td>@mdo</td>
						</tr>
						-->
					  </tbody>
					</table>
					
                       
                </div>
            <!--End Main Content Area-->
            </div>

            <div id="footerInnerSeparator"></div>
        </div>
    </div>

    <div id="footerOuterSeparator"></div>

    <div id="divFooter" class="footerArea">

        <div class="divPanel">

            <div class="row-fluid">
                <div class="span3" id="footerArea1">
                
                    <h3>About Company</h3>

                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry’s standard dummy text ever since the 1500s.</p>
                    
                    <p> 
                        <a href="#" title="Terms of Use">Terms of Use</a><br />
                        <a href="#" title="Privacy Policy">Privacy Policy</a><br />
                        <a href="#" title="FAQ">FAQ</a><br />
                        <a href="#" title="Sitemap">Sitemap</a>
                    </p>

                </div>
                <div class="span3" id="footerArea2">

                    <h3>Recent Blog Posts</h3> 
                    <p>
                        <a href="#" title="">Lorem Ipsum is simply dummy text</a><br />
                        <span style="text-transform:none;">2 hours ago</span>
                    </p>
                    <p>
                        <a href="#" title="">Duis mollis, est non commodo luctus</a><br />
                        <span style="text-transform:none;">5 hours ago</span>
                    </p>
                    <p>
                        <a href="#" title="">Maecenas sed diam eget risus varius</a><br />
                        <span style="text-transform:none;">19 hours ago</span>
                    </p>
                    <p>
                        <a href="#" title="">VIEW ALL POSTS</a>
                    </p>

                </div>
                <div class="span3" id="footerArea3">

                    <h3>Sample Content</h3> 
                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry’s standard dummy text ever since the 1500s. 
                        Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry’s standard dummy text ever since the 1500s.
                    </p>

                </div>
                <div class="span3" id="footerArea4">

                    <h3>Get in Touch</h3>  
                                                               
                    <ul id="contact-info">
                    <li>                                    
                        <i class="general foundicon-phone icon"></i>
                        <span class="field">Phone:</span>
                        <br />
                        (123) 456 7890 / 456 7891                                                                      
                    </li>
                    <li>
                        <i class="general foundicon-mail icon"></i>
                        <span class="field">Email:</span>
                        <br />
                        <a href="mailto:info@yourdomain.com" title="Email">info@yourdomain.com</a>
                    </li>
                    <li>
                        <i class="general foundicon-home icon" style="margin-bottom:50px"></i>
                        <span class="field">Address:</span>
                        <br />
                        123 Street<br />
                        12345 City, State<br />
                        Country
                    </li>
                    </ul>

                </div>
            </div>

            <br /><br />
            <div class="row-fluid">
                <div class="span12">
                    <p class="copyright">
                        Copyright © 2013 Your Company. All Rights Reserved.
                    </p>

                    <p class="social_bookmarks">
                        <a href="#"><i class="social foundicon-facebook"></i> Facebook</a>
			<a href=""><i class="social foundicon-twitter"></i> Twitter</a>
			<a href="#"><i class="social foundicon-pinterest"></i> Pinterest</a>
			<a href="#"><i class="social foundicon-rss"></i> Rss</a>
                    </p>
                </div>
            </div>

        </div>
    </div>
</div>
<br /><br /><br />

<script src="scripts/jquery.min.js" type="text/javascript"></script> 
<script src="scripts/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="scripts/default.js" type="text/javascript"></script>
<script>
function getCustomerDetails(){

	$.ajax({
	  method: "GET",
	  url: 'http://localhost:8080/couriertracking/person/' + $("#search-person-id").val(),
	  data: "",
	  dataType: 'json',
	  contentType: "application/json; charset=utf-8",
	})
	.done(function(data) {
		
		var trHTML="";
		var no = 0;
		trHTML += '<tr><td>' + data.ssn + '</td><td>' + data.fName + '</td><td>' + data.lName + '</td><td>' + data.street + '</td><td>' + data.city + '</td><td>' + data.country + '</td><td>' + data.postalCode + '</td></tr>';
        $('#branch-data').append(trHTML);
	})
	.fail(function() {
	  alert("Ajax failed to fetch data")
	})

}

// var csrf_token = '${_csrf.token}';

// $("body").bind("ajaxSend", function(elm, xhr, s){
//    if (s.type == "POST") {
//       xhr.setRequestHeader('X-CSRF-Token', csrf_token);
//    }
// });
						


function saveCustomer(){

	var person = {
		ssn : $('#txtSSN').val(),
		fName : $('#txtFName').val(),
		lName : $('#txtLName').val(),
		street : $('#txtStreet').val(),
		city : $('#txtCity').val(),
		country : $('#cmbCountry').val(),
		postalCode : $('#txtPCode').val(),
	}

	$.ajax({
	  method: "POST",
	  url: 'http://localhost:8080/couriertracking/person/create',
	  data: JSON.stringify( person ),
	  dataType: 'json',
	  contentType: "application/json; charset=utf-8",
	  success:function(data) {
         window.location.replace("http://localhost:8080/couriertracking/customers");
      }
	})
	// .done(function(data) {
	// 	window.location.replace("http://localhost:8080/couriertracking/branches");
	//   alert(data)
	// })
	.fail(function() {
	  window.location.replace("http://localhost:8080/couriertracking/customers");
	})
}


</script>




</body>
</html>