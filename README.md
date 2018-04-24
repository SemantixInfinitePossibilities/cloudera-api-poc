# POC - Cloudera API 
## Objetivos
* Como recuperar queries feitas via Impala
  Via API Rest do Cloudera Manager
* Como recuperar queries feitas via Hive
  Via API do Resource Manager
* Como recuperar queries feitas via programa (ex. Spark jobs)
  ...
  
## Cloudera Manager 
* API Rest Doc: `https://cloudera.github.io/cm_api/apidocs/v11/index.html`
* Exemplos na VM quickstart:
 ```
 curl -u cloudera:cloudera -X GET http://quickstart.cloudera:7180/api/v11/clusters
 curl -u cloudera:cloudera -X GET http://quickstart.cloudera:7180/api/v11/clusters/Cloudera%20QuickStart/services/
 curl -u cloudera:cloudera -X GET "http://quickstart.cloudera:7180/api/v11/cm/service/"
 curl -u cloudera:cloudera -X GET "http://quickstart.cloudera:7180/api/v11/users/"
 curl -u cloudera:cloudera -X GET "http://quickstart.cloudera:7180/api/v11/clusters/Cloudera%20QuickStart/services/"
```
* Recuperando as consultas feitas via Impala:
```curl -u cloudera:cloudera -X GET "http://quickstart.cloudera:7180/api/v11/clusters/Cloudera%20QuickStart/services/impala/impalaQueries"
```

## Cloudera Navigator


##
