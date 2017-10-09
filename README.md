# Example project to demonstrate using DNS for cluster discovery in OpenShift

## Build And Deploy
1. Ensure you are logged in to an OpenShift cluster using the `oc` CLI tool
1. Ensure you are using a project where you have permissions to deploy an application
1. Run the deployment using Maven and the fabric8 Maven plugin
```
mvn clean package vertx:package fabric8:deploy
```