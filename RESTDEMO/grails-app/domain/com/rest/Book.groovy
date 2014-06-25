package com.rest

import grails.rest.*
@Resource(uri='/books')
class Book {

	String title

	static constraints = {
		title blank:false
	}
}

/*@Resource(uri='/books')
class Book {

    String title
    String description
    Date date

  //  static belongsTo = [ author:Author ]

    static constraints = {
        description(nullable: true)
        date (nullable: true)
    }

    static mapping = {
    }

}
*/