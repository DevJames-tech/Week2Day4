# Week2Day4
Assignment not turned in on time, because I wanted to focus on studying for the Friday Test
1. Come up with some use cases in which a content provider would be helpful.

Content providers can help an application manage access to data stored by itself, stored by other apps, and provide a way to share data with other apps. They encapsulate the data, and provide mechanisms for defining data security.

2. How does file streams work in JAVA?

You create an instance of a file stream then you can either read or write from that stream to accomplish some task
3. Explain the process of implementing a content provider, and to get the info from a content provider.

A content provider manages access to a central repository of data. A provider is part of an Android application, which often provides its own UI for working with the data. However, content providers are primarily intended to be used by other applications, which access the provider using a provider client object
public class ExampleProvider extends ContentProvider {
...
    // Creates a UriMatcher object.
    private static final UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

    static {
        /*
         * The calls to addURI() go here, for all of the content URI patterns that the provider
         * should recognize. For this snippet, only the calls for table 3 are shown.
         */

        /*
         * Sets the integer value for multiple rows in table 3 to 1. Notice that no wildcard is used
         * in the path
         */
        uriMatcher.addURI("com.example.app.provider", "table3", 1);

        /*
         * Sets the code for a single row to 2. In this case, the "#" wildcard is
         * used. "content://com.example.app.provider/table3/3" matches, but
         * "content://com.example.app.provider/table3 doesn't.
         */
        uriMatcher.addURI("com.example.app.provider", "table3/#", 2);
    }
...
    // Implements ContentProvider.query()
    public Cursor query(
        Uri uri,
        String[] projection,
        String selection,
        String[] selectionArgs,
        String sortOrder) {
...
        /*
         * Choose the table to query and a sort order based on the code returned for the incoming
         * URI. Here, too, only the statements for table 3 are shown.
         */
        switch (uriMatcher.match(uri)) {


            // If the incoming URI was for all of table3
            case 1:

                if (TextUtils.isEmpty(sortOrder)) sortOrder = "_ID ASC";
                break;

            // If the incoming URI was for a single row
            case 2:

                /*
                 * Because this URI was for a single row, the _ID value part is
                 * present. Get the last path segment from the URI; this is the _ID value.
                 * Then, append the value to the WHERE clause for the query
                 */
                selection = selection + "_ID = " + uri.getLastPathSegment();
                break;

            default:
            ...
                // If the URI is not recognized, you should do some error handling here.
        }
        // call the code to actually do the query
    }
4. What is a vector drawable and how do we implement and use them in android?

A VectorDrawable is a vector graphic defined in an XML file as a set of points, lines, and curves along with its associated color information. The major advantage of using a vector drawable is image scalability. It can be scaled without loss of display quality

5. Define the following:
    1. Content Resolver
What is the Content Resolver? The Content Resolver is the single, global instance in your application that provides access to your (and other applications') content providers

    2. Primary Key (Sql)
￼
www.sitesbay.com
A primary key is a field in a table which uniquely identifies each row/record in a database table. Primary keys must contain unique values.
A primary key is a field in a table which uniquely identifies each row/record in a database table.
 
    3. Foreign Key (Sql)
￼
www.mysqltutorial.org
A foreign key is a column or group of columns in a relational database table that provides a link between data in two tables.
    4. Relational Database

A relational database is a set of formally described tables from which data can be accessed or reassembled in many different ways without having to reorganize the database tables.

    5. Dangerous Permissions

dangerous permissions in (that is, permissions that could potentially affect the user's privacy or the device's normal operation)

6. What is a ORM?

Stands for object related mapping:
a programming technique for converting data between incompatible type system using object-orientated programming languages. 

7. Explain how you would upgrade a Table in your database with a new column while preserving the data already in said table.

By using the alter table command in sql
