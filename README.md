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
```
 curl -u cloudera:cloudera -X GET  http://quickstart.cloudera:7180/api/v11/clusters/Cloudera%20QuickStart/services/impala/impalaQueries
```
Saída, onde a consulta está no campo `statement` : 
```json
{
  "queries" : [ {
    "queryId" : "b748fb153f6d24d2:898315600000000",
    "statement" : "SELECT * FROM db.table1",
    "queryType" : "N/A",
    "queryState" : "EXCEPTION",
    "startTime" : "2018-04-23T21:01:28.939Z",
    "endTime" : "2018-04-23T21:01:29.582Z",
    "rowsProduced" : null,
    "attributes" : {
      "admission_result" : "Unknown",
      "session_id" : "9f4b93d417729234:5796113b035c7e97",
      "oom" : "false",
      "stats_missing" : "false",
      "connected_user" : "cloudera",
      "session_type" : "HIVESERVER2",
      "network_address" : "10.0.2.15:42032",
      "impala_version" : "impalad version 2.9.0-cdh5.12.0 RELEASE (build 03c6ddbdcec39238be4f5b14a300d5c4f576097e)",
      "query_status" : "AnalysisException: Could not resolve table reference: 'db1.tb1'\n",
      "file_formats" : ""
    },
    "user" : "cloudera",
    "coordinator" : {
      "hostId" : "quickstart.cloudera"
    },
    "detailsAvailable" : true,
    "database" : "default",
    "durationMillis" : 643
  }
```
## Cloudera Navigator


##
