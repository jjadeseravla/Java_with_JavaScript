function greet(name, element) {
    console.log(`Hey, ${name}! This is from the js rendering on the dev tools on the localhost of eighyeighty`);
    element.$server.greet("server");
}