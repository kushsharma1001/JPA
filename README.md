# JPA
Example to show JPA demo
1) JPARepository extends CRUDRepository and PagingAndSortingRepository. SO JPARepository has some extra methods.
2) @Entity class should always implement Serializable.
3) Instead of autowiring at instance var level, use @autowired at the same class constructor.
4) We use @Id annotation for making a field a Primary key, similarly we can use @EmbeddedId to use a composite primary key (suppose,
   we have to use fields "id" and "dob" as a ID. So, create a Corresponding class with @Embeddable annotation having id and dob as 
   fields and use this classname as one of the field in your entity class and use @Embeddable in your entity class at this 
   corresponding classname variable.)
