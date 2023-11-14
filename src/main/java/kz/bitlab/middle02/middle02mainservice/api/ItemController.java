package kz.bitlab.middle02.middle02mainservice.api;

import kz.bitlab.middle02.middle02mainservice.dto.ItemDto;
import kz.bitlab.middle02.middle02mainservice.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping
    public List<ItemDto> getItems(){
        return itemService.getItems();
    }

    @GetMapping(value = "{id}")
    public ItemDto getItem(@PathVariable(name = "id") Long id){
        return itemService.getItem(id);
    }

    @PostMapping
    public ItemDto addItem(@RequestBody ItemDto itemDto){
        return itemService.addItem(itemDto);
    }

    @PutMapping
    public ItemDto updateItem(@RequestBody ItemDto itemDto){
        return itemService.updateItem(itemDto);
    }

    @DeleteMapping(value = "{id}")
    public void deleteItem(@PathVariable(name = "id") Long id){
        itemService.deleteItem(id);
    }
}
