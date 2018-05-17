# springboot-angular4-cassandra
## DB scripts;

create keyspace delta with replication={'class':'SimpleStrategy', 'replication_factor':1};

use delta;
 
CREATE TABLE customer(
   id timeuuid PRIMARY KEY,
   name text,
   age int,
   active boolean
);
