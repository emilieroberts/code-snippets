//Let the UI know this view has a context menu
registerForContextMenu(myView);

. . .

@Override
public void onCreateContextMenu(ContextMenu menu, View v,
                               ContextMenu.ContextMenuInfo menuInfo) {
   super.onCreateContextMenu(menu, v, menuInfo);
   MenuInflater inflater = getMenuInflater();
   inflater.inflate(R.menu.context_menu, menu);
}

@Override
public boolean onContextItemSelected(MenuItem item) {
   if (R.id.menu_item_id == item.getItemId()) {
       Snackbar.make(findViewById(android.R.id.content),
               getString(R.string.menu_item_message), Snackbar.LENGTH_SHORT).show();
       return true;
   } else {
       return super.onContextItemSelected(item);
   }
}
