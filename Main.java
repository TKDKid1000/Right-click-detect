package me.rightclick.plugin
public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
    	  // register event
        getServer().getPluginManager().registerEvents(this, this);
    }
    
    @Override
    public void onDisable() {

    }
    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Action action = event.getAction();
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        World world = player.getWorld();
        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
        ItemStack helditem = player.getPlayer().getInventory().getItemInMainHand();
        if (helditem.getType() == Material.STICK) {
          player.chat("i just right clicked my stick! at + block.getLocation());
          
       }
  }
}
