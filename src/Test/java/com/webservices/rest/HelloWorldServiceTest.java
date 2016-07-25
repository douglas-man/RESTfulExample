package com.webservices.rest;


class HelloWorldServiceTest {

    private HttpServer server;
    private WebTarget target;

    @Before
    public void setup() throws Exception {
        server = Main.startServer();

        Client c = ClientBuilder.newClient();
        target = c.target(Main.BASE_URI);
    }

    @After
    public void tearDown() throws Exception {
        server.stop();
    }

    @Test
    public void testGetMsg() {

    }
}