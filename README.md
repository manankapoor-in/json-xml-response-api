# Important steps to enable your API to performm same.
An example to understand how using one endpoint we can get response back in JSON and XML formats.

1. Use dependency in your pom.xml
   <pre>
       &lt;dependency&gt;
			&lt;group&gt;Idcom.fasterxml.jackson.dataformat&lt;/groupId&gt;
			&lt;artifactId&gt;jackson-dataformat-xml&lt;/artifactId&gt;
		&lt;/dependency&gt;
   </pre>
   
2. Use the produces attribute in @GetMapping annotation
   <pre>
     @GetMapping(value = "/employee", produces = { "application/json", "application/xml" })
   
   Which returns response back in either JSON or XML based upon client requests in header. i.e,
   
   Accept: application/json
             OR
   Accept: application/xml
   </pre>

   
