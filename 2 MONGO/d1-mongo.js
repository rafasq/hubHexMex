db.emp.insert (
	{ name: "Chaaru",
 		details: {
 		age: "19 years",
		 standard: "BE first year"
	 },
	 Batch: [ 
		{ size: "Small", qty: 15 },
		 { size: "Medium", qty: 25 }
		 ],
 	category: "Computer Science"
 	}
 )

// User Story : As a Flight Agent I need to book tickets with the flight name, from, to and all connecting flights from Chennai to Mexico.

// collection / flights
// name
// 	from
// 	to
// 	departure
// 	arrival
// category business/ ecomomy

db.ticket.insert(
	{
	name: "Thai Air Asia",
	trip: [
		{from: "Mexico City International Airport (MEX)", to: "George Bush Intercontinental Airport (IAH)" },
		{from: "George Bush Intercontinental Airport (IAH)", to :"Istanbul Airport (IST)" },
		{from: "Istanbul Airport (IST)", to: "Chhatrapati Shivaji Maharaj International Airport (BOM)" },
		{from: "Chhatrapati Shivaji Maharaj International Airport (BOM)", to: "Chennai International Airport (MAA)" }
	      ]
	}
)

db.ticket6.insertMany(
	[
	{from: "Mexico City International Airport (MEX)", to: "Venice Marco Polo Airport (VCE)" },
	{from: "Mexico City International Airport (MEX)", to :"Narita International Airport (NRT)" },
	{from: "Mexico City International Airport (MEX)", to :"Paris Charles de Gaulle Airport (CDG)" },
	{from: "Paris Charles de Gaulle Airport (CDG)", to :"Gatwick Airport (LGW)" },
	{from: "Mexico City International Airport (MEX)", to :"Gatwick Airport (LGW)" },
]
);

db.ticket1.insert( {from: "Mexico City International Airport (MEX)", to: "Venice Marco Polo Airport (VCE)" } )
db.ticket1.insert({from: "Mexico City International Airport (MEX)", to :"Narita International Airport (NRT)" })
	
var tripList = [
	{from: "Mexico City International Airport (MEX)", to: "Venice Marco Polo Airport (VCE)" },
	{from: "Mexico City International Airport (MEX)", to :"Narita International Airport (NRT)" }
];

db.ticket1.insert(tripList);
db.ticket1.find({}, {_id:0});

db.ticket1.find({}, {_id:0});

// -- all flight reaching Gatwick / no obj id's

db.ticket6.find({to:"Gatwick Airport (LGW)"},{_id:0});