# JPA
Example to show JPA demo
1) JPARepository extends CRUDRepository and PagingAndSortingRepository. SO JPARepository has some extra methods.
2) @Entity class should always implement Serializable.
3) Instead of autowiring at instance var level, use @autowired at the same class constructor.
4) We use @Id annotation for making a field a Primary key, similarly we can use @EmbeddedId to use a composite primary key (suppose,
   we have to use fields "id" and "dob" as a ID. So, create a Corresponding class with @Embeddable annotation having id and dob as 
   fields and use this classname as one of the field in your entity class and use @Embeddable in your entity class at this 
   corresponding classname variable.)
5) IN reources folder, add schema.sql with queries to create a table.
                       add data.sql to add data to tables.
   Finally, In application.properties, add spring.jpa.hibernate.ddl-auto=none
   
   With these 3 things, spring will create and add data and we dont have to do anything else.

Note: When data is added to tables and some String in db should map to Enum type in @Entity class. then, we need a converter at compile time. So create a class implementing AttributeConverter and override its uniplemented methods to solve this problem.
