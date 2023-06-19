db = db.getSiblingDB('shoe_db');

db.createCollection("shoes");

db.shoes.insertMany([
    {
        size: 38,
        color: "black",
        model: "sb",
        producer: "nike",
        price: 270.0
    },
    {
        size: 40,
        color: "red",
        model: "mercurial",
        producer: "adidas",
        price: 350.0
    },
    {
        size: 43,
        color: "white",
        model: "air max",
        producer: "nike",
        price: 820.0
    }
]);