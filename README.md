# Right click detect
The source code for my right click detector how to on reddit.
Step 1. Define the event. If you have not used the event api before, don’t worry. It is fairly simple to use. You must first use an @EventHandler annotation then create your event. I will name my event onClick (you can name it whatever) the event you want to use is the PlayerInteractEvent.
Code so far:
  @EventHandler
  public void onInteract(PlayerInteractEvent event) {
  }

Step 2. Define all variables. This part is fairly simple. I am going to use very basic names, but you can use any name you want. You will need to define an Action and a Player, but if you want to get the block they clicked you have to define Block and World.
Code so far:
  @EventHandler
  public void onInteract(PlayerInteractEvent event) {
        Action action = event.getAction();
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        World world = player.getWorld();
  }

Step 3. Get the action type. You want to make sure you are only running your program when you right click. (Unless you want left click, I will give examples for all) To get the action type you use 
if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK))
Ok can add or statements to allow left clicks as well, and you can remove RIGHT_CLICK_AIR if you want it to only happen when you right click a block, or vise versa.
Code so far:

  @EventHandler
  public void onInteract(PlayerInteractEvent event) {
        Action action = event.getAction();
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        World world = player.getWorld();
        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {

       }
  }

Step 4. Get held item. This step is fairly simple, and if you have used bukkit before you have likely done this. But nonetheless I am going to include it here. You can get the players held item by defining an itemstack of their held item, then checking if that items type is what we want. You can also check for itemmeta, but I am not going to include that here.
Code so far:

  @EventHandler
  public void onInteract(PlayerInteractEvent event) {
        Action action = event.getAction();
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        World world = player.getWorld();
        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
        ItemStack helditem = player.getPlayer().getInventory().getItemInMainHand();
        	if (helditem.getType() == Material.FIRE_CHARGE) {
          // program here
       }
  }
Step 5. You are all done! Replace // program here with whatever code you want. Now if you use an ide it might say that the variables block and world are unused, they are there if you want to say, get the block the player clicked and set it to stone (the example in the source code) if you don’t plan on using those then just remove them.
