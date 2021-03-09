const sendToServer = ( data ) => {
    const binder = zkbind.$( "$client" );
    binder.command( "addByClient", data );
}