# TCI-Hackathon
TCI Hackathon 2016


##ElastiCache Plug-in
![alt text](images/ElastiCachePlugin.png "ElastiCache Plug-in")


ElastiCache is a specification about in memory data storage of applications in a Java environment. The ElastiCache Plug-in can be used to set, get and delete data from **AWS ElastiCache** in **TIBCO BusinessWorks process**. It uses AWS(**memcached**) as a datastore.
For more information about AWS ElastiCache adn its configuration. Please refer to:
https://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/GettingStarted.html

**`NOTE: No Redis integration yet.`**

##Operations supported:

 * Set: Store or Update Text, Bytes, Objects or XML data into memcached with a key and an expiration duration.
 * Get: Get the data from memcached with a key
 * Delete: Delete the data from memcached with a key
 

## Set Activity:
![alt text](images/SetActivity.png "Set Activity Configuration")
## Get Activity:
![alt text](images/GetActivity.png "Get Activity Configuration")
## Delete Activity:
![alt text](images/DeleteActivity.png "Delete Activity Configuration")
